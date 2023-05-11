package com.example.demo.service.serviceImpl;

import com.example.demo.model.PieceJointe;
import com.example.demo.repository.PieceJointeRepo;
import com.example.demo.service.PieceJointeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PieceJointeServiceImpl implements PieceJointeService {

    private final PieceJointeRepo pieceJointeRepo;

    @Override
    public List<PieceJointe> getListePieceJointe() {
        return pieceJointeRepo.findAll();
    }

    public PieceJointe store(MultipartFile file, Long idCollavorateur) throws IOException {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        PieceJointe FileDB = new PieceJointe();


        FileDB.setIdCollaborateur(idCollavorateur);

        FileDB.setName(fileName);

        FileDB.setType(file.getContentType());

        FileDB.setData(file.getBytes());


        return pieceJointeRepo.save(FileDB);

    }

    @Override
    public PieceJointe getPieceJointeById(Long idPieceJointe) {
        return pieceJointeRepo.findById(idPieceJointe).get();
    }
}
