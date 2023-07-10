package com.example.demo.util.gson;

import java.io.IOException;
import java.util.Optional;

public interface MapperJsonObjeto {

    Optional<String> ejecutar(Object objeto) throws IOException;

    <T> Optional<T> ejecutar(String json, Class<T> claseDestino);

    Optional<String> ejecutarGson(Object objecto);
}
