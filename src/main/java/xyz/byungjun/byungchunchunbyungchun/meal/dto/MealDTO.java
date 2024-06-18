package xyz.byungjun.byungchunchunbyungchun.meal.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import xyz.byungjun.byungchunchunbyungchun.meal.entity.MealEntity;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MealDTO {
    private LocalDate date;
    private String time;
    private String meal;

    public MealEntity toMealEntity() {
        return MealEntity.builder()
                .date(date)
                .time(time)
                .meal(meal)
                .build();
    }
}