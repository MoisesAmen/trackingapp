package com.example.trackingapp.controller;

import com.example.trackingapp.entity.Coordinate;
import com.example.trackingapp.entity.Route;
import com.example.trackingapp.service.RouteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/routes")
public class RouteController {
    private final RouteService routeService;

    public RouteController(RouteService routeService) {
        this.routeService = routeService;
    }

    @PostMapping
    public ResponseEntity<Route> saveRoute(@RequestParam String name, @RequestBody List<Coordinate> coordinates) {
        Route savedRoute = routeService.saveRoute(name, coordinates);
        return ResponseEntity.ok(savedRoute);
    }

    @GetMapping
    public ResponseEntity<List<Route>> getAllRoutes() {
        return ResponseEntity.ok(routeService.getAllRoutes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Route> getRouteById(@PathVariable Long id) {
        return ResponseEntity.ok(routeService.getRouteById(id));
    }
}
