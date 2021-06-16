page 50105 BoxOfficeCard
{
    PageType = Card;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = BoxOffice;
    DelayedInsert = true;
    AutoSplitKey = true;

    layout
    {
        area(Content)
        {
            group(BoxOffice)
            {
                field(Rating; Rec.Rating)
                {
                    ApplicationArea = All;

                }
                field(DomesticSales; Rec.DomesticSales)
                {
                    ApplicationArea = All;
                }
                field(InternationalSales; Rec.InternationalSales)
                {
                    ApplicationArea = All;
                }
                field(MovieId; Rec.MovieId)
                {
                    ApplicationArea = All;

                }
            }
        }
    }

    actions
    {
        area(Processing)
        {
            action(ActionName)
            {
                ApplicationArea = All;

                trigger OnAction()
                begin

                end;
            }
        }
    }

    var
        myInt: Integer;
}