package sjsu.cmpe273.project.client;

import java.rmi.RemoteException;

import sjsu.cmpe273.project.beans.FlightDetailBean;
import sjsu.cmpe273.project.beans.JourneyDetailBean;
import sjsu.cmpe273.project.beans.LocationsBean;
import sjsu.cmpe273.project.service.AirlineManagementServiceProxy;

public class AirlineClient {

	public FlightDetailBean[] listAllFlights() {

		FlightDetailBean flightArray[] = null;
		AirlineManagementServiceProxy proxy = new AirlineManagementServiceProxy();

		try {
			flightArray = proxy.listAllFlights();
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return flightArray;
	}

	public LocationsBean[] listAllLocations() {

		LocationsBean locationList[] = null;
		AirlineManagementServiceProxy proxy = new AirlineManagementServiceProxy();

		try {
			locationList = proxy.listAllLocations();
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return locationList;
	}

	public boolean scheduleFlight(JourneyDetailBean journeyDetailBean) {

		boolean isSuccess = true;
		AirlineManagementServiceProxy proxy = new AirlineManagementServiceProxy();

		try {
			isSuccess = proxy.scheduleFlight(journeyDetailBean);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return isSuccess;
	}

	public boolean checkDuplicateFlight(JourneyDetailBean journeyDetailBean) {
		boolean isDuplicate = false;

		AirlineManagementServiceProxy proxy = new AirlineManagementServiceProxy();
		try {
			isDuplicate = proxy.checkDuplicateFlight(journeyDetailBean);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return isDuplicate;
	}
	
	public JourneyDetailBean[] listAllJourneys(){
		JourneyDetailBean journeyList[] = null;
		
		AirlineManagementServiceProxy proxy = new AirlineManagementServiceProxy();
		
		try {
			journeyList = proxy.listAllJourneys();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return journeyList;
	}
	
	public JourneyDetailBean journeyDetail(int journeyId){
		JourneyDetailBean journeyDetailBean = null;
		
		AirlineManagementServiceProxy proxy = new AirlineManagementServiceProxy();
		
		try {
			journeyDetailBean = proxy.journeyDetail(journeyId);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return journeyDetailBean;
	}
	
	public boolean updatejourney(JourneyDetailBean journeyDetailBean){
		boolean isInserted = true;
		
		AirlineManagementServiceProxy proxy = new AirlineManagementServiceProxy();
		try {
			isInserted = proxy.updatejourney(journeyDetailBean);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return isInserted;
	}
	
	public boolean cancelJourney(int journeyId){
		boolean isCancelled = true;
		
		AirlineManagementServiceProxy proxy = new AirlineManagementServiceProxy();
		
		try {
			isCancelled = proxy.cancelJourney(journeyId);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return isCancelled;
	}
}
