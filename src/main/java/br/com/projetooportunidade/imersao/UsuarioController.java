package br.com.projetooportunidade.imersao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/users")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository repository;

	@GetMapping()
	public @ResponseBody Iterable<Usuario> all() {
		return repository.findAll();
	}
	
	public ResponseEntity<Usuario> add(@RequestBody Usuario u) {
		
		return null;
	}
}
