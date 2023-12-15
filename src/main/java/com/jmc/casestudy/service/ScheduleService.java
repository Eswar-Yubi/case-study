package com.jmc.casestudy.service;

import com.jmc.casestudy.payload.request.AddScheduleRequest;
import com.jmc.casestudy.payload.response.RouteDetailsResponse;
import com.jmc.casestudy.model.Schedule;
import java.util.List;

public interface ScheduleService {

  void addSchedule(AddScheduleRequest addScheduleRequest);

  List<Schedule> getAllSchedule();

  List<RouteDetailsResponse> getScheduleByRouteId(Long routeId);
}
