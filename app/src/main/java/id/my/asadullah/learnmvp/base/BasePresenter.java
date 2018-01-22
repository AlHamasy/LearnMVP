package id.my.asadullah.learnmvp.base;

/**
 * Created by asadullah on 1/22/18.
 */

public interface BasePresenter <T extends MainView> {

    void onAttach(T view);
    void onDetach();

}
