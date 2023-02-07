package dio.myfirstwebapi.repository;

import dio.myfirstwebapi.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {

    public void save(Usuario usuario){
        if(usuario.getId()==null)
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");

        System.out.println(usuario);
    }

    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<Usuario>findAll(){
        System.out.println("List - Listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("marcelo","filho"));
        usuarios.add(new Usuario("Cristina","mae"));
        return usuarios;

    }
    public Usuario findById(Integer id){
        System.out.println(String.format("GET/id - Recebendo o id: %d para localizar um usuário id"));
        return new Usuario("marcelo","filho");
    }
    public Usuario findByUsername(String username){
        System.out.println(String.format("FIND/user - Recebendo o username: %s para localizar um usuario",username ));
        return new Usuario("marcelo","filho");
    }

}
