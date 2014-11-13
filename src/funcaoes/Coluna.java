/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package funcaoes;

/**
 *
 * @author Luiz Otávio Dorigon
 */
/**
    * Classe interna utilizada para armazenar o nome de uma coluna e a classe
    * Java correspondente ao tipo de dado da mesma
    */
   public class Coluna {

      /**
       * A classe Java do tipo de dado da coluna
       */
      public final Class<?> CLASS;

      /**
       * O nome da coluna
       */
      public final String   NAME;


      /**
       * Instancia um objeto {@link Coluna} com o tipo de dado e nome
       * informados
       *
       * @param type
       *            A classe Java correspondente ao tipo de dado da coluna
       * @param name
       *            O nome da coluna
       */
      public Coluna(final String name) throws ClassNotFoundException {
         NAME = name;
         CLASS = Class.forName(String.class.getName());
      }

   }
