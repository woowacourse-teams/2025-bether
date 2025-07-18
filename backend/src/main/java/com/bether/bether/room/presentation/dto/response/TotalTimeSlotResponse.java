package com.bether.bether.room.presentation.dto.response;

import com.bether.bether.timeslot.domain.TimeSlot;
import java.time.LocalDateTime;
import java.util.List;

public record TotalTimeSlotResponse(
        List<TimeSlotResponse> timeSlots
) {

    public static TotalTimeSlotResponse from(final List<TimeSlot> timeSlots) {
        return new TotalTimeSlotResponse(timeSlots.stream()
                .map(timeSlot -> new TimeSlotResponse(timeSlot.getUserName(), timeSlot.getStartAt()))
                .toList()
        );
    }

    private record TimeSlotResponse(
            String userName,
            LocalDateTime dateTime
    ) {
    }
}
