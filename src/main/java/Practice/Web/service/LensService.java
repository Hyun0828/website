package Practice.Web.service;

import Practice.Web.domain.item.Lens;
import Practice.Web.repository.LensRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class LensService {

    private final LensRepository lensRepository;

    public Lens findOne(Long id){
        return lensRepository.findOne(id);
    }

    public List<Lens> findAll(){
        return lensRepository.findAll();
    }
}
