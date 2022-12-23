Feature: PressGesture

	Scenario: Larger scale after longclick
		Given that the user is on the hammer.js page
		When the user makes a longclick on the green frame
		Then the green frame expands its size to 225 x 225