package com.example.Search_nearest_bank.controller;

import com.example.Search_nearest_bank.model.Bank;
import com.example.Search_nearest_bank.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BankController {

    @Autowired
    BankService service;

    @PostMapping("/adding-bank")
    public String add(@RequestBody Bank bank){
        return service.add(bank);
    }
    @GetMapping("/get-all-bank")
    public List<Bank> getAllBank(){
        return service.getAllBank();
    }
    @GetMapping("/get-info/{id}")
    public Optional<Bank> getBankById(@PathVariable Long id){
        return service.getBankById(id);
    }
    @GetMapping("/get-bank-name/{bankName}")
    public List<Bank> getBankByName(@PathVariable String bankName) {
        return service.getBankByName(bankName);
    }
    @GetMapping("/get-city/{city}")
    public List<Bank> getBankByCity(@PathVariable String city) {
        return service.getBankByCity(city);
    }
    @GetMapping("/get-pinCode/{pinCode}")
    public List<Bank> getBankByPinCode(@PathVariable String pinCode) {
        return service.getBankByPinCode(pinCode);
    }
    @GetMapping("/get-state/{state}")
    public List<Bank> getBankByState(@PathVariable String state) {
        return service.getBankByState(state);
    }
}
