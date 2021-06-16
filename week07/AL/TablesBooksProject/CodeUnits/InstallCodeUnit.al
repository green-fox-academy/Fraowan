codeunit 50101 InstallCodeUnit
{
    Subtype = Install;

    trigger OnInstallAppPerCompany()
    var
        AuthorRecord: Record Author;
    begin
        if AuthorRecord.IsEmpty then begin
            InsertAuthor(1, 'Dan Abnett');
            InsertAuthor(2, 'Graham McNeill');
            InsertAuthor(3, 'George Orwell');
        end;
    end;

    local procedure InsertAuthor(Id: Integer; Name: Text[150])
    var
        AuthorRecord: Record Author;
    begin

        AuthorRecord.Id := Id;
        AuthorRecord.Name := Name;
        AuthorRecord.Insert();


    end;
}