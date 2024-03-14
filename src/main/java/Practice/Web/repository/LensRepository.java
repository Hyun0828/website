package Practice.Web.repository;

import Practice.Web.domain.item.Lens;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class LensRepository {

    private final EntityManager em;

    public Lens findOne(Long id) {
        return em.find(Lens.class, id);
    }

    public List<Lens> findAll(){
        return em.createQuery("select g from Glasses g", Lens.class)
                .getResultList();
    }
}
