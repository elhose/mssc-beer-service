package tt.psc.msscbeerservice.web.mappers;

import org.mapstruct.Mapper;
import tt.psc.msscbeerservice.web.domain.Beer;
import tt.psc.msscbeerservice.web.model.BeerDto;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beertoBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto beerDto);
}
