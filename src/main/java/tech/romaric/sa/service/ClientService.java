package tech.romaric.sa.service;

import org.springframework.stereotype.Service;
import tech.romaric.sa.entites.Client;
import tech.romaric.sa.repository.ClientRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void creer(Client client){
        Client clientInDb =  this.clientRepository.findByEmail(client.getEmail());
        if (clientInDb == null){
            this.clientRepository.save(client);
        }
    }

    public List<Client> rechercher(){
        return this.clientRepository.findAll();
    }

    public Client lire(int id) {
        Optional<Client> optionalClient = this.clientRepository.findById(id);
        return optionalClient.orElse(null);
    }
}
