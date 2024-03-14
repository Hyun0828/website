package Practice.Web.service;

import Practice.Web.domain.item.Glasses;
import Practice.Web.repository.GlassesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class GlassesService {

    private final GlassesRepository glassesRepository;

    public Glasses findOne(Long id){
        return glassesRepository.findOne(id);
    }

    public List<Glasses> findAll(){
        return glassesRepository.findAll();
    }
}
