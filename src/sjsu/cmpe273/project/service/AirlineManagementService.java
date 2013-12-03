/**
 * AirlineManagementService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package sjsu.cmpe273.project.service;

public interface AirlineManagementService extends java.rmi.Remote {
    public sjsu.cmpe273.project.beans.UserBean login(java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException;
    public sjsu.cmpe273.project.beans.UserBean createUser(sjsu.cmpe273.project.beans.PersonBean personBean) throws java.rmi.RemoteException;
    public java.lang.String createBooking(sjsu.cmpe273.project.beans.FlightDetailBean flightDetailBean, sjsu.cmpe273.project.beans.TravelerBean travelerBean) throws java.rmi.RemoteException;
    public java.lang.String cancelBooking(sjsu.cmpe273.project.beans.TravelerBean travelerBean) throws java.rmi.RemoteException;
    public sjsu.cmpe273.project.beans.FlightDetailBean[] searchFlights(sjsu.cmpe273.project.beans.FlightDetailBean flightDetailBean) throws java.rmi.RemoteException;
    public sjsu.cmpe273.project.beans.JourneyDetailBean journeyDetail(int journeyId) throws java.rmi.RemoteException;
    public boolean updatejourney(sjsu.cmpe273.project.beans.JourneyDetailBean journeyDetailBean) throws java.rmi.RemoteException;
    public sjsu.cmpe273.project.beans.FlightDetailBean editFlight(sjsu.cmpe273.project.beans.FlightDetailBean flightDetailBean) throws java.rmi.RemoteException;
    public boolean logOff(java.lang.String userSsn) throws java.rmi.RemoteException;
    public boolean issueTicket(sjsu.cmpe273.project.beans.UserBean userBean) throws java.rmi.RemoteException;
    public sjsu.cmpe273.project.beans.PaymentDetailsBean makePayment(sjsu.cmpe273.project.beans.UserBean userBean, sjsu.cmpe273.project.beans.JourneyDetailBean journeyDetailBean) throws java.rmi.RemoteException;
    public boolean deleteUser(java.lang.String userSsn) throws java.rmi.RemoteException;
    public sjsu.cmpe273.project.beans.UserBean editUser(sjsu.cmpe273.project.beans.UserBean userBean) throws java.rmi.RemoteException;
    public boolean cancelJourney(int journeyId) throws java.rmi.RemoteException;
    public sjsu.cmpe273.project.beans.JourneyDetailBean[] accountActivity(java.lang.String userSsn) throws java.rmi.RemoteException;
    public void createEmployee(sjsu.cmpe273.project.beans.UserBean userBean) throws java.rmi.RemoteException;
    public boolean deleteEmployee(int userSsn) throws java.rmi.RemoteException;
    public sjsu.cmpe273.project.beans.UserBean[] listAllEmployees() throws java.rmi.RemoteException;
    public sjsu.cmpe273.project.beans.PassengerBean[] passengerOnBoard(int journeyId, sjsu.cmpe273.project.beans.TravelerBean travelerBean) throws java.rmi.RemoteException;
    public sjsu.cmpe273.project.beans.FlightDetailBean[] listAllFlights() throws java.rmi.RemoteException;
    public boolean scheduleFlight(sjsu.cmpe273.project.beans.JourneyDetailBean journeyDetailBean) throws java.rmi.RemoteException;
    public sjsu.cmpe273.project.beans.UserBean[] listAllCustomer() throws java.rmi.RemoteException;
    public sjsu.cmpe273.project.beans.ReservationDetailBean[] listAllReservation() throws java.rmi.RemoteException;
    public sjsu.cmpe273.project.beans.UserBean showEmployeeDetail(sjsu.cmpe273.project.beans.AirlineEmployeeBean airlineEmployeeBean) throws java.rmi.RemoteException;
    public sjsu.cmpe273.project.beans.JourneyDetailBean[] listAllJourneys() throws java.rmi.RemoteException;
    public sjsu.cmpe273.project.beans.LocationsBean[] listAllLocations() throws java.rmi.RemoteException;
    public boolean checkDuplicateFlight(sjsu.cmpe273.project.beans.JourneyDetailBean journeyDetailBean) throws java.rmi.RemoteException;
}
