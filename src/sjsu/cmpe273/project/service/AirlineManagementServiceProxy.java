package sjsu.cmpe273.project.service;

public class AirlineManagementServiceProxy implements sjsu.cmpe273.project.service.AirlineManagementService {
  private String _endpoint = null;
  private sjsu.cmpe273.project.service.AirlineManagementService airlineManagementService = null;
  
  public AirlineManagementServiceProxy() {
    _initAirlineManagementServiceProxy();
  }
  
  public AirlineManagementServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initAirlineManagementServiceProxy();
  }
  
  private void _initAirlineManagementServiceProxy() {
    try {
      airlineManagementService = (new sjsu.cmpe273.project.service.AirlineManagementServiceServiceLocator()).getAirlineManagementService();
      if (airlineManagementService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)airlineManagementService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)airlineManagementService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (airlineManagementService != null)
      ((javax.xml.rpc.Stub)airlineManagementService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public sjsu.cmpe273.project.service.AirlineManagementService getAirlineManagementService() {
    if (airlineManagementService == null)
      _initAirlineManagementServiceProxy();
    return airlineManagementService;
  }
  
  public sjsu.cmpe273.project.beans.UserBean login(java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException{
    if (airlineManagementService == null)
      _initAirlineManagementServiceProxy();
    return airlineManagementService.login(userName, password);
  }
  
  public boolean deleteEmployee(java.lang.String userSsn) throws java.rmi.RemoteException{
    if (airlineManagementService == null)
      _initAirlineManagementServiceProxy();
    return airlineManagementService.deleteEmployee(userSsn);
  }
  
  public sjsu.cmpe273.project.beans.JourneyDetailBean[] accountActivity(java.lang.String userSsn) throws java.rmi.RemoteException{
    if (airlineManagementService == null)
      _initAirlineManagementServiceProxy();
    return airlineManagementService.accountActivity(userSsn);
  }
  
  public sjsu.cmpe273.project.beans.UserBean createEmployee(sjsu.cmpe273.project.beans.UserBean userBean) throws java.rmi.RemoteException{
    if (airlineManagementService == null)
      _initAirlineManagementServiceProxy();
    return airlineManagementService.createEmployee(userBean);
  }
  
  public sjsu.cmpe273.project.beans.FlightDetailBean[] listAllFlights() throws java.rmi.RemoteException{
    if (airlineManagementService == null)
      _initAirlineManagementServiceProxy();
    return airlineManagementService.listAllFlights();
  }
  
  public sjsu.cmpe273.project.beans.UserBean showEmployeeDetail(sjsu.cmpe273.project.beans.AirlineEmployeeBean airlineEmployeeBean) throws java.rmi.RemoteException{
    if (airlineManagementService == null)
      _initAirlineManagementServiceProxy();
    return airlineManagementService.showEmployeeDetail(airlineEmployeeBean);
  }
  
  public sjsu.cmpe273.project.beans.PassengerBean[] passengerOnBoard(int journeyId, sjsu.cmpe273.project.beans.TravelerBean travelerBean) throws java.rmi.RemoteException{
    if (airlineManagementService == null)
      _initAirlineManagementServiceProxy();
    return airlineManagementService.passengerOnBoard(journeyId, travelerBean);
  }
  
  public boolean scheduleFlight(sjsu.cmpe273.project.beans.JourneyDetailBean journeyDetailBean) throws java.rmi.RemoteException{
    if (airlineManagementService == null)
      _initAirlineManagementServiceProxy();
    return airlineManagementService.scheduleFlight(journeyDetailBean);
  }
  
  public sjsu.cmpe273.project.beans.UserBean[] listAllEmployees() throws java.rmi.RemoteException{
    if (airlineManagementService == null)
      _initAirlineManagementServiceProxy();
    return airlineManagementService.listAllEmployees();
  }
  
  public sjsu.cmpe273.project.beans.LocationsBean[] listAllLocations() throws java.rmi.RemoteException{
    if (airlineManagementService == null)
      _initAirlineManagementServiceProxy();
    return airlineManagementService.listAllLocations();
  }
  
  public boolean checkDuplicateFlight(sjsu.cmpe273.project.beans.JourneyDetailBean journeyDetailBean) throws java.rmi.RemoteException{
    if (airlineManagementService == null)
      _initAirlineManagementServiceProxy();
    return airlineManagementService.checkDuplicateFlight(journeyDetailBean);
  }
  
  public sjsu.cmpe273.project.beans.ReservationDetailBean[] listAllReservation() throws java.rmi.RemoteException{
    if (airlineManagementService == null)
      _initAirlineManagementServiceProxy();
    return airlineManagementService.listAllReservation();
  }
  
  public sjsu.cmpe273.project.beans.UserBean[] listAllCustomer() throws java.rmi.RemoteException{
    if (airlineManagementService == null)
      _initAirlineManagementServiceProxy();
    return airlineManagementService.listAllCustomer();
  }
  
  public boolean logOff(java.lang.String userSsn) throws java.rmi.RemoteException{
    if (airlineManagementService == null)
      _initAirlineManagementServiceProxy();
    return airlineManagementService.logOff(userSsn);
  }
  
  public sjsu.cmpe273.project.beans.PaymentDetailsBean makePayment(sjsu.cmpe273.project.beans.UserBean userBean, sjsu.cmpe273.project.beans.JourneyDetailBean journeyDetailBean) throws java.rmi.RemoteException{
    if (airlineManagementService == null)
      _initAirlineManagementServiceProxy();
    return airlineManagementService.makePayment(userBean, journeyDetailBean);
  }
  
  public sjsu.cmpe273.project.beans.UserBean createUser(sjsu.cmpe273.project.beans.PersonBean personBean) throws java.rmi.RemoteException{
    if (airlineManagementService == null)
      _initAirlineManagementServiceProxy();
    return airlineManagementService.createUser(personBean);
  }
  
  public boolean deleteUser(java.lang.String userSsn) throws java.rmi.RemoteException{
    if (airlineManagementService == null)
      _initAirlineManagementServiceProxy();
    return airlineManagementService.deleteUser(userSsn);
  }
  
  public java.lang.String createBooking(sjsu.cmpe273.project.beans.FlightDetailBean flightDetailBean, sjsu.cmpe273.project.beans.TravelerBean travelerBean) throws java.rmi.RemoteException{
    if (airlineManagementService == null)
      _initAirlineManagementServiceProxy();
    return airlineManagementService.createBooking(flightDetailBean, travelerBean);
  }
  
  public sjsu.cmpe273.project.beans.FlightDetailBean editFlight(sjsu.cmpe273.project.beans.FlightDetailBean flightDetailBean) throws java.rmi.RemoteException{
    if (airlineManagementService == null)
      _initAirlineManagementServiceProxy();
    return airlineManagementService.editFlight(flightDetailBean);
  }
  
  public boolean issueTicket(sjsu.cmpe273.project.beans.UserBean userBean) throws java.rmi.RemoteException{
    if (airlineManagementService == null)
      _initAirlineManagementServiceProxy();
    return airlineManagementService.issueTicket(userBean);
  }
  
  public sjsu.cmpe273.project.beans.FlightDetailBean[] searchFlights(sjsu.cmpe273.project.beans.FlightDetailBean flightDetailBean) throws java.rmi.RemoteException{
    if (airlineManagementService == null)
      _initAirlineManagementServiceProxy();
    return airlineManagementService.searchFlights(flightDetailBean);
  }
  
  public java.lang.String cancelBooking(sjsu.cmpe273.project.beans.TravelerBean travelerBean) throws java.rmi.RemoteException{
    if (airlineManagementService == null)
      _initAirlineManagementServiceProxy();
    return airlineManagementService.cancelBooking(travelerBean);
  }
  
  public sjsu.cmpe273.project.beans.UserBean editUser(sjsu.cmpe273.project.beans.UserBean userBean) throws java.rmi.RemoteException{
    if (airlineManagementService == null)
      _initAirlineManagementServiceProxy();
    return airlineManagementService.editUser(userBean);
  }
  
  
}