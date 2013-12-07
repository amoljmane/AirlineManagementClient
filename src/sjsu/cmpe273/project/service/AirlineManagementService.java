/**
 * AirlineManagementService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package sjsu.cmpe273.project.service;

public interface AirlineManagementService extends java.rmi.Remote {
    public void main(java.lang.String[] args) throws java.rmi.RemoteException;
    public sjsu.cmpe273.project.beans.JourneyDetailBean[] accountActivity(java.lang.String userSsn) throws java.rmi.RemoteException;
    public int createEmployee(sjsu.cmpe273.project.beans.UserBean userBean) throws java.rmi.RemoteException;
    public boolean deleteEmployee(int id) throws java.rmi.RemoteException;
    public sjsu.cmpe273.project.beans.UserBean[] listAllEmployees() throws java.rmi.RemoteException;
    public sjsu.cmpe273.project.beans.UserBean[] searchEmployee(java.lang.String searchType, sjsu.cmpe273.project.beans.UserBean employee) throws java.rmi.RemoteException;
    public boolean updateEmployee(sjsu.cmpe273.project.beans.PersonBean person) throws java.rmi.RemoteException;
    public sjsu.cmpe273.project.beans.UserBean[] searchCustomer(java.lang.String searchType, sjsu.cmpe273.project.beans.UserBean customer) throws java.rmi.RemoteException;
    public sjsu.cmpe273.project.beans.UserBean findCustomerByID(int book_id) throws java.rmi.RemoteException;
    public sjsu.cmpe273.project.beans.UserBean showEmployeeDetail(sjsu.cmpe273.project.beans.AirlineEmployeeBean airlineEmployeeBean) throws java.rmi.RemoteException;
    public sjsu.cmpe273.project.beans.JourneyDetailBean[] searchJourneys(java.lang.String to, java.lang.String from, java.lang.String time) throws java.rmi.RemoteException;
    public sjsu.cmpe273.project.beans.PassengerBean passengerOnBoard(sjsu.cmpe273.project.beans.JourneyDetailBean journey) throws java.rmi.RemoteException;
    public java.lang.String createCustomer(sjsu.cmpe273.project.beans.UserBean customer) throws java.rmi.RemoteException;
    public sjsu.cmpe273.project.beans.UserBean[] listAllCustomer() throws java.rmi.RemoteException;
    public sjsu.cmpe273.project.beans.ReservationLists listAllReservation() throws java.rmi.RemoteException;
    public sjsu.cmpe273.project.beans.FlightDetailBean[] listAllFlights() throws java.rmi.RemoteException;
    public boolean scheduleJourney(sjsu.cmpe273.project.beans.JourneyDetailBean journeyDetailBean) throws java.rmi.RemoteException;
    public sjsu.cmpe273.project.beans.LocationsBean[] listAllLocations() throws java.rmi.RemoteException;
    public boolean checkDuplicateFlight(sjsu.cmpe273.project.beans.JourneyDetailBean journeyDetailBean) throws java.rmi.RemoteException;
    public sjsu.cmpe273.project.beans.JourneyDetailBean[] listAllJourneys() throws java.rmi.RemoteException;
    public sjsu.cmpe273.project.beans.JourneyDetailBean[] listAllActiveJourneys(int source, int destination) throws java.rmi.RemoteException;
    public sjsu.cmpe273.project.beans.UserBean login(java.lang.String email, java.lang.String password) throws java.rmi.RemoteException;
    public boolean cancelJourney(int journeyId) throws java.rmi.RemoteException;
    public sjsu.cmpe273.project.beans.UserBean editUser(sjsu.cmpe273.project.beans.UserBean userBean) throws java.rmi.RemoteException;
    public sjsu.cmpe273.project.beans.FlightDetailBean editFlight(sjsu.cmpe273.project.beans.FlightDetailBean flightDetailBean) throws java.rmi.RemoteException;
    public boolean issueTicket(sjsu.cmpe273.project.beans.UserBean userBean) throws java.rmi.RemoteException;
    public sjsu.cmpe273.project.beans.PaymentDetailsBean makePayment(sjsu.cmpe273.project.beans.UserBean userBean, sjsu.cmpe273.project.beans.JourneyDetailBean journeyDetailBean) throws java.rmi.RemoteException;
    public boolean cancelBooking(int bookingId) throws java.rmi.RemoteException;
    public java.lang.String createBooking(sjsu.cmpe273.project.beans.JourneyDetailBean journeyBean, sjsu.cmpe273.project.beans.UserBean[] userBeans, sjsu.cmpe273.project.beans.PaymentDetailsBean paymentBean) throws java.rmi.RemoteException;
    public boolean updatePerson(sjsu.cmpe273.project.beans.PersonBean person) throws java.rmi.RemoteException;
    public sjsu.cmpe273.project.beans.JourneyDetailBean journeyDetail(int journeyId) throws java.rmi.RemoteException;
    public boolean updatejourney(sjsu.cmpe273.project.beans.JourneyDetailBean journeyDetailBean) throws java.rmi.RemoteException;
    public sjsu.cmpe273.project.beans.UserBean createUser(sjsu.cmpe273.project.beans.PersonBean personBean) throws java.rmi.RemoteException;
    public boolean deleteUser(java.lang.String userSsn) throws java.rmi.RemoteException;
    public boolean logOff(java.lang.String userSsn) throws java.rmi.RemoteException;
    public sjsu.cmpe273.project.beans.FlightDetailBean[] searchFlights(sjsu.cmpe273.project.beans.FlightDetailBean flightDetailBean) throws java.rmi.RemoteException;
}
