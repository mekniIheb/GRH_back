package com.example.demo.service.serviceImpl;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepo;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;

    @Transactional(rollbackOn = Exception.class)
    public User ajouterUser(User user) {
        try {
            User user1 = userRepo.save(user);
            log.info("user ajoutee");
            return user1;
        } catch (Exception e) {
            throw new ResourceNotFoundException("erreur d'ajouter user");
        }

    }

    @Transactional
    public User modifierUser(User user, Long id) {
        try {
            User user1 = getUserById(id);
            user1.setCin(user.getCin());
            user1.setNomComplet(user.getNomComplet());
            user1.setNumeroDuCompte(user.getNumeroDuCompte());
            user1.setNumeroSecuriteSociale(user.getNumeroSecuriteSociale());
            user1.setNumeroTelephone(user.getNumeroTelephone());
            user1.setDateDeNaissance(user.getDateDeNaissance());
            user1.setAdresse(user.getAdresse());
            user1.setEmail(user.getEmail());
            user1.setNatureEtude(user.getNatureEtude());
            user1.setCertifications(user.getCertifications());
            user1.setAnneeExperience(user.getAnneeExperience());
            user1.setRecomendation(user.getRecomendation());
            user1.setCollaborateur(user.getCollaborateur());
            user1.setCommentaire(user.getCommentaire());
            User user2 = userRepo.save(user1);
            log.info("user modifiee ");
            return user2;
        } catch (Exception e) {
            log.error("erreur de modifier user");
            throw new ResourceNotFoundException("erreur de modofiee user");
        }
    }

    public void supprimerUser(Long id) {
        try {
            userRepo.deleteById(id);
            log.info("user supprimee");
        } catch (Exception e) {
            log.error("erreur de supprimer user");
            throw new ResourceNotFoundException("erreur de supprimer user");
        }
    }

    public List<User> getListUser() {
        try {
            List<User> users = userRepo.findAll();
            log.info("get users ");
            return users;
        } catch (Exception e) {
            log.error("error get user");
            throw new ResourceNotFoundException("error get users");
        }
    }

    public User getUserById(Long id) {
        try {
            User user = userRepo.findById(id).get();
            log.info("user existe ");
            return user;
        } catch (Exception e) {
            log.error("user n'existe pas ");
            throw new ResourceNotFoundException("user n'existe pas");
        }
    }
    public Double getMasseSalariale(Long idUser) {
        return userRepo.getMasseSalarialeUser(idUser);

    }

    public Double getPyramideAge() {
        return userRepo.getPyramideAge();
    }
    public Double getSalaireMoyenne() {
        return userRepo.getSalaireMoyenne();
    }
    public Double getSumSalaireMoy() {
        return userRepo.getSumSalaireMoy();
    }
}
