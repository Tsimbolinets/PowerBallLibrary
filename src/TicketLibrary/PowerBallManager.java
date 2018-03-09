package TicketLibrary;

public class PowerBallManager {


    private ITicketRegistrar registrar;

    private IUserIOProvider ioProvider;

    private IPowerBallStatistic statistic;

    private IPowerBallChecker checker;

    public PowerBallManager(ITicketRegistrar registrar, IUserIOProvider ioProvider,
                            IPowerBallStatistic statistic, IPowerBallChecker checker) {
        this.registrar = registrar;
        this.ioProvider = ioProvider;
        this.statistic = statistic;
        this.checker = checker;
    }

    public ITicketRegistrar getRegistrar() {
        return registrar;
    }

    public void setRegistrar(ITicketRegistrar registrar) {
        this.registrar = registrar;
    }

    public IPowerBallStatistic getStatistic() {
        return statistic;
    }

    public void setStatistic(IPowerBallStatistic statistic) {
        this.statistic = statistic;
    }

    public IPowerBallChecker getChecker() {
        return checker;
    }

    public void setChecker(IPowerBallChecker checker) {
        this.checker = checker;
    }

    public IUserIOProvider getIoProvider() {
        return ioProvider;
    }

    public void setIoProvider(IUserIOProvider ioProvider) {
        this.ioProvider = ioProvider;
    }
}
