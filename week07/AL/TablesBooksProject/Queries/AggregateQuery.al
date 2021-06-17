query 50101 AggregateQuery
{
    QueryType = Normal;
    OrderBy = descending(SumBookPageCount);

    elements
    {
        dataitem(AuthorTable; Author)
        {
            column(AuthorName; Name)
            {

            }

            dataitem(MyBook; Book)
            {
                DataItemLink = AuthorId = AuthorTable.Id;
                SqlJoinType = InnerJoin;


                column(SumBookPageCount; PageCount)
                {
                    Method = Sum;
                }
            }
        }
    }


    trigger OnBeforeOpen()
    begin
        TopNumberOfRows(1);
    end;
}