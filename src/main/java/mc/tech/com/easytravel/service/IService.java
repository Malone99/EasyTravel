package mc.tech.com.easytravel.service;

import com.google.i18n.phonenumbers.NumberParseException;

import java.util.List;
import java.util.Optional;

public interface IService<T,ID>  {
    T save(T t);
    Optional<T > read(ID id);
    T findByiDD(int id);
    List<T> findALL();
    T update(T t) throws NumberParseException;
}