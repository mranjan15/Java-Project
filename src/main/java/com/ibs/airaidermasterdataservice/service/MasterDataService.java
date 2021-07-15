/**
 * 
 */
package com.ibs.airaidermasterdataservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibs.airaidermasterdataservice.model.MasterDataRequestModel;
import com.ibs.airaidermasterdataservice.model.MasterDataResponseModel;

/**
 * @author 91940
 *
 */
@Service
public class MasterDataService {

	@Autowired
	AirportMasterDataService airportMasterDataService;
	
//	@Autowired
//	MasterDataResponseModel masterDataResponseModel;

	public MasterDataResponseModel fetchMasterData(MasterDataRequestModel masterDataRequestModel) {
		MasterDataResponseModel masterDataResponseModel;
		
		if (masterDataRequestModel.getAirportCodeSet() != null) {	
			
			masterDataResponseModel = airportMasterDataService.getAirportDetails(masterDataRequestModel.getAirportCodeSet(),masterDataRequestModel.getQueryId());
		} else {
			masterDataResponseModel = new MasterDataResponseModel();
		}
		
		return masterDataResponseModel;

	}
}
