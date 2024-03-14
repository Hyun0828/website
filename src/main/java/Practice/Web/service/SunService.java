package Practice.Web.service;

import Practice.Web.domain.item.Sunglasses;
import Practice.Web.repository.SunRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SunService {

    private final SunRepository sunRepository;

    public Sunglasses findOne(Long id){
        return sunRepository.findOne(id);
    }

    public List<Sunglasses> findAll(){
        return sunRepository.findAll();
    }
}
