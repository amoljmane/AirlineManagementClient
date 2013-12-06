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
			isSuccess = proxy.scheduleJourney(journeyDetailBean);
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
}
