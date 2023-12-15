package com.jmc.casestudy.controller;

import com.jmc.casestudy.payload.request.AddScheduleRequest;
import com.jmc.casestudy.model.Bus;
import com.jmc.casestudy.payload.response.GenericResponse;
import com.jmc.casestudy.service.BusService;
import com.jmc.casestudy.service.ScheduleService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

  @Autowired BusService busService;

  @Autowired ScheduleService scheduleService;

  @PostMapping("/add-bus")
  public ResponseEntity<GenericResponse> addBus(@Valid @RequestBody Bus bus) {
    busService.add(bus);
    return ResponseEntity.ok(new GenericResponse("Bus added successfully"));
  }

  @PostMapping("/edit-bus")
  public ResponseEntity<GenericResponse> editBus(@Valid @RequestBody Bus bus) {
    busService.edit(bus);
    return ResponseEntity.ok(new GenericResponse("Bus edited successfully"));
  }

  @PostMapping("/delete-bus/{regNum}")
  public ResponseEntity<GenericResponse> deleteBus(@PathVariable String regNum) {
    busService.delete(regNum);
    return ResponseEntity.ok(new GenericResponse("Bus deleted successfully"));
  }

  @PostMapping("/add-schedule")
  public ResponseEntity<GenericResponse> addSchedule(
      @RequestBody AddScheduleRequest addScheduleRequest) {
    scheduleService.addSchedule(addScheduleRequest);
    return ResponseEntity.ok(new GenericResponse("Bus deleted successfully"));
  }
}
