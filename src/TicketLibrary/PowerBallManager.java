package TicketLibrary;


public class PowerBallManager extends PowerBallChecker {


    private IUserOutputProvider IUserOutputProvider;

    private ITicketRegistrar registrar;

    public PowerBallManager() {
    }

    public PowerBallManager(ITicketRegistrar registrar, IUserOutputProvider IUserOutputProvider) {
        this.registrar = registrar;
        this.IUserOutputProvider = IUserOutputProvider;
    }

    public IUserOutputProvider getIUserOutputProvider() {
        return IUserOutputProvider;
    }

    public void setIUserOutputProvider(IUserOutputProvider IUserOutputProvider) {
        this.IUserOutputProvider = IUserOutputProvider;
    }

    public ITicketRegistrar getRegistrar() {
        return registrar;
    }

    public void setRegistrar(ITicketRegistrar registrar) {
        this.registrar = registrar;
    }


}
