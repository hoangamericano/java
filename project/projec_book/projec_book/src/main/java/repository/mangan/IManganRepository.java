package repository.mangan;

import org.springframework.data.jpa.repository.JpaRepository;

import model.mangan.Mangan;

public interface IManganRepository  extends JpaRepository<Mangan, Integer>{
    
}
