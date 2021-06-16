page 50106 RoleCenterBookCardPart
{
    PageType = CardPart;
    SourceTable = Book;

    layout
    {
        area(Content)
        {
            cuegroup(GroupStats)
            {
                ShowCaption = false;
                field(NumberOfBooks; Rec.NumberOfBooks)
                {
                    ApplicationArea = All;
                    Caption = 'Number of books';
                    DrillDownPageId = BookList;
                }
                field(NumOfHardcoverBooks; Rec.NumOfHardcoverBooks)
                {
                    ApplicationArea = All;
                    Caption = 'Number of hardcover books';
                    DrillDownPageId = BookList;

                }
                field(SumOfHoursToRead; Rec.SumOfHoursToRead)
                {
                    ApplicationArea = All;
                    Caption = 'Hours to read all books';

                }
            }
        }
    }


    var
        myInt: Integer;
}