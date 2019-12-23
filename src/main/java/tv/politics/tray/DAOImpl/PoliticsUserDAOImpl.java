package tv.politics.tray.DAOImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import tv.politics.tray.dao.PoliticsUserDAO;
import tv.politics.tray.model.PoliticsUserModel;

public class PoliticsUserDAOImpl implements PoliticsUserDAO{

  @Override
  public List<PoliticsUserModel> findAll(Sort sort) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<PoliticsUserModel> findAllById(Iterable<Long> ids) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public <S extends PoliticsUserModel> List<S> saveAll(Iterable<S> entities) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void flush() {
    // TODO Auto-generated method stub

  }

  @Override
  public <S extends PoliticsUserModel> S saveAndFlush(S entity) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void deleteInBatch(Iterable<PoliticsUserModel> entities) {
    // TODO Auto-generated method stub

  }

  @Override
  public void deleteAllInBatch() {
    // TODO Auto-generated method stub

  }

  @Override
  public PoliticsUserModel getOne(Long id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public <S extends PoliticsUserModel> List<S> findAll(Example<S> example) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public <S extends PoliticsUserModel> List<S> findAll(Example<S> example, Sort sort) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Page<PoliticsUserModel> findAll(Pageable pageable) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean existsById(Long id) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public long count() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public void deleteById(Long id) {
    // TODO Auto-generated method stub

  }

  @Override
  public void delete(PoliticsUserModel entity) {
    // TODO Auto-generated method stub

  }

  @Override
  public void deleteAll(Iterable<? extends PoliticsUserModel> entities) {
    // TODO Auto-generated method stub

  }

  @Override
  public void deleteAll() {
    // TODO Auto-generated method stub

  }

  @Override
  public <S extends PoliticsUserModel> Optional<S> findOne(Example<S> example) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public <S extends PoliticsUserModel> Page<S> findAll(Example<S> example, Pageable pageable) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public <S extends PoliticsUserModel> long count(Example<S> example) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public <S extends PoliticsUserModel> boolean exists(Example<S> example) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public PoliticsUserModel save(PoliticsUserModel politicsUserModel) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<PoliticsUserModel> findAll() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Optional<PoliticsUserModel> findById(Long id) {
    // TODO Auto-generated method stub
    return null;
  }



}
