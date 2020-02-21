package ru.kolyasnikovkv.collectiondvd.controller;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.kolyasnikovkv.collectiondvd.dto.CountryDto;
import ru.kolyasnikovkv.collectiondvd.model.Country;
import ru.kolyasnikovkv.collectiondvd.service.CountryService;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.http.ResponseEntity.ok;
import static org.springframework.http.ResponseEntity.status;

@RestController
@RequestMapping(value = CountryController.REST_URL, produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class CountryController {

   static final String REST_URL = "/rest/country";
   private final CountryService countryService;


   @GetMapping("/{id}")
   @ResponseBody
    public CountryDto get(@PathVariable Long id) {
       CountryDto countryDto = countryService.get(id);
       return countryDto;
       /*ObjectMapper objectMapper = new ObjectMapper();
       String json = objectMapper.writeValueAsString(result);
       return json;*/
    }

   /*private final AccountRepository accountRepository;
    private final UserRepository userRepository;
    private final AccountToResponseConverter converter;

    @GetMapping("/accounts")
    @ResponseBody
    public ResponseEntity<List<AccountResponse>> listAll(@AuthenticationPrincipal CustomUserDetails userDetails) {
        List<Account> accounts = accountRepository.findAccountsByOwnerId(userDetails.getId());
        return ok(
                accounts.stream()
                        .map(converter::convert)
                        .collect(Collectors.toList())
        );
    }

    @PostMapping("/accounts")
    @ResponseBody
    public ResponseEntity<AccountResponse> add(@RequestBody AccountRequest request,
                                               @AuthenticationPrincipal CustomUserDetails userDetails) {
        if (!accountRepository.existsByNameAndOwnerId(request.getName(), userDetails.getId())) {
            Account account = new Account();
            account.setName(request.getName());
            account.setBalance(request.getBalance());
            account.setOwner(userRepository.getOne(userDetails.getId()));
            account = accountRepository.save(account);

            return ok(converter.convert(account));
        }
        return status(HttpStatus.BAD_REQUEST).build();
    }

    @PutMapping("/accounts/{account:\\d+}")
    @ResponseBody
    public ResponseEntity<AccountResponse> update(@PathVariable Account account,
                                                  @RequestBody AccountRequest request,
                                                  @AuthenticationPrincipal CustomUserDetails userDetails) {
        if (account != null && account.getOwner().getId().equals(userDetails.getId())) {
            if (request.getName() != null) {
                account.setName(request.getName());
            }
            if (request.getBalance() != null) {
                account.setBalance(request.getBalance());
            }
            account = accountRepository.save(account);
            return ok(converter.convert(account));
        }
        return status(HttpStatus.BAD_REQUEST).build();
    }

    @DeleteMapping("/accounts/{account:\\d+}")
    @ResponseBody
    public ResponseEntity<AccountResponse> delete(@PathVariable Account account,
                                                  @AuthenticationPrincipal CustomUserDetails userDetails) {
        if (account != null && userDetails.getId().equals(account.getOwner().getId())) {
            accountRepository.delete(account);
        }
        return status(HttpStatus.NO_CONTENT).build();
    }
    */
}
