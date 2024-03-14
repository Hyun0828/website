package Practice.Web.repository;

import Practice.Web.domain.item.Sunglasses;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class SunRepository {

    private final EntityManager em;

    public Sunglasses findOne(Long id) {
        return em.find(Sunglasses.class, id);
    }

    public List<Sunglasses> findAll(){
        return em.createQuery("select g from Glasses g", Sunglasses.class)
                .getResultList();
    }
}
