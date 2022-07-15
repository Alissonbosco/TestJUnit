package com.syonet;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;

class AppTest {

    @ParameterizedTest( name = "Testando cumprimento com: {0}" )
    @CsvSource( { "Fred", "Robson", "Alberto", "Rodrigo" } )
    @DisplayName( "Testando cumprimentos" )
    public void testGreeting( String name ) {
        String greeting = App.greeting( name );
        String expectedGreeting = "Hello " + name;
        assertEquals( expectedGreeting, greeting, "O cumprimento não foi gerado corretamente!" );
    }

    @ParameterizedTest( name = "Testando soma com: {0}" )
    @CsvSource( { "1,2", "5,6" } )
    @DisplayName( "Testando soma" )
    public void testSum( String num1, String num2 ) {
        Float num1float = Float.valueOf( num1 );
        Float num2float = Float.valueOf( num2 );
        Float sum = App.sum( num1float, num2float );
        Float expectedSum = num1float + num2float;
        assertEquals( expectedSum, sum, "A soma não está correta!" );
    }

    @ParameterizedTest( name = "Testando veiculo com: {0}" )
    @CsvSource( { "Gol, Uno, Astra, Vectra" } )
    @DisplayName( "Testando veiculos" )
    public void testRandomCar( ArgumentsAccessor args ) {
        String[] strings = Arrays.asList(args.toArray()).toArray( new String[ 0 ] );
        List< String > cars = Arrays.asList( strings );
        String carInArray = App.randomStringFromGivenArray(strings);
        Boolean carsValidated = cars.contains(carInArray);
        assertTrue(carsValidated, "o veiculo não foi encontrado");
    }

}
