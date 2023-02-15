#include "Human.cpp"

using namespace std;

class Civitas : public Human
{
private:
    string univ;
    string email;

public:
    Civitas()
    {
        this->univ = "";
        this->email = "";
    }

    string GetUniv() const
    {
        return this->univ;
    }

    void SetUniv(string univ)
    {
        this->univ = univ;
    }

    string GetEmail() const
    {
        return email;
    }

    void SetEmail(string email)
    {
        this->email = email;
    }

    ~Civitas()
    {
    }
};