package com.sks.nifty.controller;

import com.sks.nifty.service.NiftyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class NiftyController {
  private final NiftyService niftyService;

    @GetMapping("/niftyPrice")
    public Float getNiftyPrice(){
        return niftyService.getNiftyPrice();
    }

    @GetMapping("/senSexPrice")
    public Float getSenSexPrice(){
        return niftyService.getSenSexPrice();
    }

    @GetMapping("/bankPrice")
    public Float getBankNifty(){
        return niftyService.getBankNifty();
    }
}
