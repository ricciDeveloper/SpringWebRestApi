package dio.SpringWebApi.Repository;

import dio.SpringWebApi.Model.Usuario;
import dio.SpringWebApi.handler.BusinessException;
import dio.SpringWebApi.handler.GlobalExceptionHandler;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario){
        if(usuario.getLogin()==null)
            throw new BusinessException("O campo login é obrigatório.");
        if(usuario.getPassword()==null)
            throw new BusinessException("O campo password é obrigatório.");
        if(usuario.getId() == null)
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }

    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - recebendo um id %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<Usuario> listAll(){
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("gleyson","password"));
        usuarios.add(new Usuario("frank","masterpass"));
        return usuarios;
    }
    public Usuario finByUserName(String login){
        System.out.println(String.format("GET/username - Recebendo o username: %s para localizar um usuário", login));
        return new Usuario("gleyson","password");
    }

}
