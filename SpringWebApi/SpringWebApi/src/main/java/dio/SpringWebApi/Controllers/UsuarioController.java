package dio.SpringWebApi.Controllers;

import dio.SpringWebApi.Model.Usuario;
import dio.SpringWebApi.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/users")
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @GetMapping()
    public List<Usuario> getUsers() {
        return usuarioRepository.listAll();

    }
    @GetMapping("/{login}")
    public Usuario getOne(@PathVariable("login") String login){
        return usuarioRepository.finByUserName(login);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        usuarioRepository.deleteById(id);
    }
    @PostMapping()
    public void postUser(@RequestBody Usuario usuario){
        usuarioRepository.save(usuario);
    }
}
