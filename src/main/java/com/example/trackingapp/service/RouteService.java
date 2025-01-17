package com.example.trackingapp.service;

import com.example.trackingapp.entity.Coordinate;
import com.example.trackingapp.entity.Route;
import com.example.trackingapp.repository.RouteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteService {
    private final RouteRepository routeRepository;

    public RouteService(RouteRepository routeRepository) {
        this.routeRepository = routeRepository;
    }

    public Route saveRoute(String name, List<Coordinate> coordinates) {
        Route route = new Route();
        route.setName(name);

        // Asignar la ruta a cada coordenada
        coordinates.forEach(coordinate -> coordinate.setRoute(route));
        route.setCoordinates(coordinates);

        return routeRepository.save(route);
    }

    public List<Route> getAllRoutes() {
        return routeRepository.findAll();
    }

    public Route getRouteById(Long id) {
        return routeRepository.findById(id).orElseThrow(() -> new RuntimeException("Route not found"));
    }
}
