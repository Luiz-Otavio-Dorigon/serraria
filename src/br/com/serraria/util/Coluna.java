package br.com.serraria.util;

/**
 *
 * @author Luiz Otávio Dorigon
 */
public class Coluna {

    public final Class<?> CLASS;

    public final String NAME;

    public Coluna(final String name) throws ClassNotFoundException {
        NAME = name;
        CLASS = Class.forName(String.class.getName());
    }

}
