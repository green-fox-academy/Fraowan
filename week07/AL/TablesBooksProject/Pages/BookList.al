page 50101 BookList
{
    PageType = List;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = Book;
    CardPageId = BookCard;

    layout
    {
        area(Content)
        {
            repeater(GroupName)
            {
                field(Id; Rec.Id)
                {
                    ApplicationArea = All;

                }
                field(Title; Rec.Title)
                {
                    ApplicationArea = All;

                }

                field(HardCover; Rec.HardCover)
                {
                    ApplicationArea = All;

                }
                field(PageCount; Rec.PageCount)
                {
                    ApplicationArea = All;

                }
                field(AuthorName; Rec.AuthorName)
                {
                    ApplicationArea = All;
                }
                field(AuthorId; Rec.AuthorID)
                {
                    ApplicationArea = All;
                }
                field(HoursToRead; Rec.HoursToRead)
                {
                    ApplicationArea = All;

                }


            }
        }
        area(FactBoxes)
        {


            systempart(Links; Links)
            {
                ApplicationArea = All;
            }
            systempart(Notes; Notes)
            {
                ApplicationArea = All;
            }
        }
    }
    actions
    {
        area(Navigation)
        {
            action(AuthorList)
            {
                ApplicationArea = All;
                Caption = 'To Author List';
                RunObject = Page AuthorList;
                RunPageMode = View;
            }
        }

    }
    trigger OnOpenPage();
    var
        MyCodeUnit: Codeunit MyTestCodeUnit;
        ReturnValue: Decimal;
    begin
        //  MyCodeUnit.Run();
        //  MyCodeUnit.WelcomeUser('Andris');
        // ReturnValue := MyCodeUnit.Addition(5, 6);
        //  Message(Format(ReturnValue));

    end;
}