page 50102 MovieList
{
    PageType = List;
    ApplicationArea = All;
    UsageCategory = Lists;
    SourceTable = Movie;
    CardPageId = MovieCard;

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
                field(Year; Rec.Year)
                {
                    ApplicationArea = All;

                }
                field(LenghtInMinutes; Rec.LenghtInMinutes)
                {
                    ApplicationArea = All;

                }
                field(DirectorId; Rec.DirectorId)
                {
                    ApplicationArea = All;

                }
                field(DirectorName; Rec.DirectorName)
                {
                    ApplicationArea = All;

                }
            }
        }
        area(Factboxes)
        {

        }
    }

    actions
    {
        area(Processing)
        {
            action(ActionName)
            {
                ApplicationArea = All;

                trigger OnAction();
                begin

                end;
            }
        }
    }
}