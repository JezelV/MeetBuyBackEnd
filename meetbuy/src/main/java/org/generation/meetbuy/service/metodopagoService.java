package org.generation.meetbuy.service;

import java.util.List;
import java.util.Optional;

import org.generation.meetbuy.model.metodopago;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class metodopagoService {
	// Definimos repositorio
		private final metodopagoRepository metodoPRepository;
		
		// Inicializamos
		@Autowired
		public metodopagoService(metodopagoRepository metodoPRepository) {
			this.metodoPRepository = metodoPRepository;
		}

		// Comenzar a utilizar metodos de nuestro Repository
		// Get metodoPago
		public List<metodopago> getMetodoPago() {
			return metodoPRepository.findAll();
		}

		// Get metodoPago
		public metodopago getMetodoPago(Long mpId) {
			return metodoPRepository.findById(mpId).orElse(null);
		}

		// SET metodoPago
		public void addMetodoPago(metodopago mp) {
			// Verificar si existe
			Optional<metodopago> metodoPagoByName = metodoPRepository.findByName(mp.getNombreT());
			if(metodoPagoByName.isPresent()) {
				throw new IllegalStateException("El metodo de pago ya existe"); // Lanza error en caso de que exista
			} else {
				metodoPRepository.save(mp); // Guarda los datos en caso de que no exista
			}	
		}

		// Revisamos si existe el producto
		// If true = se elimina
		// If false = no se elimina y lanzamos exception
		public void deleteMetodoPago(Long mpId) {
			if(metodoPRepository.findById(mpId) != null) {
				metodoPRepository.deleteById(mpId);
			} else {
				throw new IllegalStateException("El metodo de pago no existe");
			}
		}
}
