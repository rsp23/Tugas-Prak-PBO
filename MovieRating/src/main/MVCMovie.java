/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Controller.ControllerMovie;
import model.ModelMovie;
import view.ViewMovie;

/**
 *
 * @author Radesca
 */
public class MVCMovie {
        ViewMovie viewMovie = new ViewMovie();
        ModelMovie modelMovie = new ModelMovie();
        ControllerMovie controllerMovie = new ControllerMovie(viewMovie, modelMovie);
}
