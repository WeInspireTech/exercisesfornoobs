package org.mrc.exercises.lesson1;

import java.util.List;
import java.util.logging.Logger;

/**
 * A se urmari trecerea testelor
 */
public class Lesson1 {
    private static Logger logger = Logger.getLogger("marcel");

    /**
     * 0. Scrie o metoda care returneaza un String si primeste ca parametrii un string numit name si un numeral numit age
     * metoda va afisa pe ecran folosid loggerul prezent din aceasta clasa (logger.info(...)) numele si varsta frumos.
     *  Sa se apeleaza aceasta metoda dintr-o metoda main scrisa tot in aceasta clasa
     */


    /**
     * 0.1. Scrie o metoda care returneaza un List de Employee si primeste ca parametru un Employee
     *  metoda va fi apelata din metoda Main cu un employee care va avea doar id iar in metoda
     *  ii va seta nume si isActive true, apoi va fi adaugat in lista ce va fi returnata
     */


    /**
     * 1. Sa se calculeze suma tuturor salariilor primite si sa returneze suma daca totul este in regula
     * daca lista de salarii este mai mica de 4 sa se arunce exceptia SalariesListIsTooSmallException
     * sa se faca si alte verificari si sa se arunce IllegalArgumentException (verificari de tipul de defencive programming)
     */
    public int getTotalSalaries(List<Integer> salaries) {
     return 0;
    }

    /**
     * 2. Sa se scrie o metoda Main aici care se apeleze metoda de mai sus de 3 ori, o data cu o lista cu 10 salarii,
     * o data cu o lista cu lista de salarii null si sa prinda exceptia si sa afiseze un mesaj de eroare generic de tipul "O eroare a intervenit"
     * si inca o data cu o lista cu 3 salarii si sa prinda exceptia si sa afiseze mesajul de eroare din exceptie
     */
}
