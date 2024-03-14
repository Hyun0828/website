package Practice.Web.repository;


import Practice.Web.domain.item.Glasses;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class GlassesRepository {

    private final EntityManager em;

    public Glasses findOne(Long id) {
        return em.find(Glasses.class, id);
    }

    public List<Glasses> findAll(){
        return em.createQuery("select g from Glasses g", Glasses.class)
                .getResultList();
    }
}
