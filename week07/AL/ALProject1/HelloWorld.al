// Welcome to your new AL extension.
// Remember that object names and IDs should be unique across all extensions.
// AL snippets start with t*, like tpageext - give them a try and happy coding!

pageextension 50100 CustomerListExt extends "Customer List"
{

    /* trigger OnOpenPage();
     begin
         Message('Greetings, Traveller!');
     end;
 */

    /*  trigger OnOpenPage();
      var
          MyName: Text;
          MyFavouriteMusic: Text;
      begin
          MyName := 'Andris';
          MyFavouriteMusic := 'reggae';
          // Call the Message procedure
          // Show the following to the user:
          // <name>, <your favorite types of music>, 
          Message('Yello, my name is %1 and I love %2 music.', MyName, MyFavouriteMusic);
      end;
  */

    /*
      var
          MyName: Text;

      trigger OnOpenPage();
      var

          MyAge: Integer;
      begin
          MyAge := 28;
          MyName := 'Andris';
          Message('Hey, my name is %1 and I am %2 years old.', MyName, MyAge);
          // Create a global variable to store your name
          // Assign a value to the variable
          // Create a local variable and assign your age as a value
          // Show the assigned values to the users
          // The Message Prodecure can be called only once
      end;
  */
    /*
      trigger OnOpenPage();
      var
          CodingHoursPerSemester: Integer;
          CodingHoursComapredToTotalWork: Decimal;
      begin

          // An average Green Fox attendee codes 6 hours daily
          // The semester is 17 weeks long
          //
          // Print how many hours is spent with coding in a semester by an attendee,
          // if the attendee only codes on workdays.
          CodingHoursPerSemester := (17 * 5) * 6;
          Message('An average Green Fox attendee codes %1 hours in a semester', CodingHoursPerSemester);
          //
          // Print the percentage of the coding hours in the semester if the average
          // work hours weekly is 52
          CodingHoursComapredToTotalWork := (6 * 5) / 52 * 100;
          Message('An average Green Fox attendee codes %1 % of their total weekly work time', CodingHoursComapredToTotalWork);

      end;
  */

    /*
        trigger OnOpenPage();
        var
            Lenght: Decimal;
            Width: Decimal;
            Height: Decimal;
            SurfaceArea: Decimal;
            Volume: Decimal;
        begin
            Lenght := 10;
            Width := 10;
            Height := 10;
            SurfaceArea := 2 * (Lenght * Width + Lenght * Height + Width * Height);
            Message('Surface Area: %1', SurfaceArea);
            // Write a program that stores 3 sides of a cuboid as variables (doubles)
            // The program should write the surface area and volume of the cuboid like:
            //
            Volume := Lenght * Width * Height;
            Message('Volume: %1', Volume);
            // Surface Area: 600
            // Volume: 1000
        end;
    */

    /*
    trigger OnOpenPage();
    var
        A: Integer;
        B: Integer;
    begin
        A := Random(10);
        B := Random(10);

        if (A > B) then begin
            Message('%1 is bigger than %2', A, B);
        end
        else
            if (A < B) then begin
                Message('%1 is smaller than %2', A, B);
            end
            else
                if (A = B) then begin
                    Message('%1 is equal to %2', A, B);
                end;
        // Given two random numbers A and B
        // Write code that determines which number is greater
        // Don't forget that they can be even
        // Show a few examples to the user
        // Store the values in variables
    end;
    */
    /*
    trigger OnOpenPage();
    var
        Numbers: Text;
        SelectedNumbers: Integer;

    begin
        Numbers := '1,2,3,4,5,6,7,8,9,10';
        SelectedNumbers := StrMenu(Numbers, 1, 'Choose a numberoo');

        if (SelectedNumbers MOD 2 = 0) then begin
            Message('Your numberoo is evenoo');
        end
        else begin
            Message('Your numberoo is oddoo');
        end;
    end;
    // Write code that determines if a number is odd or even
    // Let the user choose from a bunch of numbers
    // Use the StrMenu function
    // Show the user if the choosen number is odd or even
*/
    /*
        trigger OnOpenPage();
        var
            ArrayOfNumbers: array[7] of Decimal;
            BiggestNumber: Decimal;
            i: Integer;
        begin
            ArrayOfNumbers[1] := 1;
            ArrayOfNumbers[2] := -2;
            ArrayOfNumbers[3] := 3.5;
            ArrayOfNumbers[4] := 3.1;
            ArrayOfNumbers[5] := 0;
            ArrayOfNumbers[6] := 9.7;
            ArrayOfNumbers[7] := 3.6;
            Message('The created array contains these numbers: %1, %2, %3, %4, %5, %6, %7', ArrayOfNumbers[1], ArrayOfNumbers[2], ArrayOfNumbers[3], ArrayOfNumbers[4], ArrayOfNumbers[5], ArrayOfNumbers[6], ArrayOfNumbers[7]);
            // Given an array of numbers [1, -2, 3.5, 3.1, 0, 9.7, 3.6]
            // Show the user the array
            // Show the user the greatest number
            // Optional: also show second greatest number

            BiggestNumber := ArrayOfNumbers[1];
            for i := 1 to ArrayLen(ArrayOfNumbers) do begin
                if (ArrayOfNumbers[i] > BiggestNumber) then begin
                    BiggestNumber := ArrayOfNumbers[i]
                end;
            end;

            Message('The biggest number in the array is: %1', BiggestNumber);

        end;
        */
    /*
trigger OnOpenPage();
var
    ArrayX: array[7] of Integer;
    ArrayY: array[5] of Integer;
    DuplicateNumberInArray: Integer;
    i: Integer;
    j: Integer;
begin
    ArrayX[1] := 1;
    ArrayX[2] := 6;
    ArrayX[3] := 3;
    ArrayX[4] := 10;
    ArrayX[5] := 4;
    ArrayX[6] := 6;
    ArrayX[7] := 1;
    for i := 1 to ArrayLen(ArrayX) do begin
        for j := i + 1 to ArrayLen(ArrayX) do begin
            if (ArrayX[i] = ArrayX[i + 1]) then begin
                DuplicateNumberInArray := ArrayX[i]
            end;
        end;
        //  if (ArrayX[i] = ArrayX[i+1]) then begin
        //     DuplicateNumberInArray := ArrayX[i]
    end;
    // Given an arrays of numbers
    // Write code that finds the first duplicate number if there is any
    // Show the duplicate number
    // [1,6,3,10,4,6,1] -> 1
    // [9,5,2,6,4] -> None
    Message('%1', DuplicateNumberInArray);
end;
*/
    trigger OnOpenPage();
    var
        NameList: array[10] of Text;
        MostFrecuentName: Text;
    begin
        NameList[1] := 'Luke';
        NameList[2] := 'Anna';
        NameList[3] := 'Emily';
        NameList[4] := 'Luke';
        NameList[5] := 'Anna';
        NameList[6] := 'Tom';
        NameList[7] := 'Emily';
        NameList[8] := 'Tom';
        NameList[9] := 'Anna';
        NameList[10] := 'Susan';

        // Given a list of names ["Luke", "Anna", "Emily", "Luke", "Anna", "Tom", "Emily", "Tom", "Anna" ,"Susan"]
        // Show the user the most frequent name in the list
        // Optional: show all names and the number of their occurencies
    end;
}