package tv.politics.tray.dao;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tv.politics.tray.model.PoliticsUserModel;

@Repository
public interface PoliticsUserDAO extends JpaRepository<PoliticsUserModel, Long>{

  @SuppressWarnings("unchecked")
  PoliticsUserModel save(PoliticsUserModel politicsUserModel);

  List<PoliticsUserModel> findAll();

  Optional<PoliticsUserModel> findById(Long id);

}
