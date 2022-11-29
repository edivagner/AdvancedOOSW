package ie.gmit.dip;

import java.time.LocalDate;

// Is immutable... read-only ... just get method
public record StudentRec(String id, String firstName, String surname, LocalDate dob, String course, String county) {
	// G0>>Samantha>>O'Reilly>>-785371626869>>Physics>>Longford
}
