package nl.hu.bep.listeners;

import nl.hu.bep.model.AquariumManager;
import nl.hu.bep.model.aquarium.Aquarium;
import nl.hu.bep.model.personen.MyUser;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        AquariumManager aqua = new AquariumManager("aqua");
        Aquarium a1 = new Aquarium("Bikini Bottom", 50, 50, 50, "helemaal zand", "helemaal zout");

        new MyUser("Ruben", "1234").setAdmin();
        new MyUser("Spons", "1234");
    }
}
